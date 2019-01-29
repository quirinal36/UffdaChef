<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Site Map</title>
<style>
ul{
    background-color: #FFFFFF;
}
li{
    margin-left:10px;
    list-style-image: url('/resources/img/comm/arrow.jpg');
}
</style>
</head>
<body>
	<div class="wrap">
		<div class="container_wrap">
			<div class="container">
				<c:if test="${fn:length(map.files) > 0}">
					<ul>
						<c:forEach items="${map.files}" var="item">
							<li><a href="/${item }">${item}</a></li>
						</c:forEach>
					</ul>
				</c:if>
				<c:if test="${fn:length(map.dirs) > 0 }">
					<ul>
						<c:forEach items="${map.dirs}" var="item">
							<li>
								<img src="/resources/img/comm/dir.jpg">${item.dirName }
								<c:if test="${fn:length(item.files)>0}">
									<ul>
									<c:forEach items="${item.files }" var="file">
										<li>
											<a href="/${item.dirName}/${file}">/${item.dirName}/${file}</a>
										</li>
									</c:forEach>
									</ul>
								</c:if>
							</li>
						</c:forEach>
					</ul>
				</c:if>
			</div>
		</div>
		
	</div>
</body>
</html>