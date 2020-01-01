<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>下载</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	</head>
	<body bgcolor=#39867b>
		<%
			java.io.BufferedInputStream bis = null;
			java.io.BufferedOutputStream bos = null;
			try {
				String filename = request.getParameter("filename");
				String filepath=request.getParameter("filepath");
				filename = new String(filename.getBytes("iso8859-1"), "gb2312");
				//System.out.println(filename);
				response.setContentType("application/x-msdownload");
				response.setHeader("Content-disposition",
						"attachment; filename="
								+ new String(filename.getBytes("gb2312"),
										"iso8859-1"));
				bis = new java.io.BufferedInputStream(
						new java.io.FileInputStream(config.getServletContext()
								.getRealPath(filepath+"/" + filename)));

				bos = new java.io.BufferedOutputStream(response
						.getOutputStream());
				byte[] buff = new byte[2048];
				int bytesRead;
				while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
					bos.write(buff, 0, bytesRead);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			}
		%>

	</body>
</html>