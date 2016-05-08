<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
<h2>Struts2 XSL result example</h2>
<s:form action="XSLAction" method="post">
<s:textfield label="Enter Code" name="code"/>
<s:textfield label="Enter Name" name="name"/>
<s:textfield label="Enter City" name="city"/>
<s:textfield label="Enter Salary" name="salary"/>
<s:submit label="Submit"/>
<s:reset label="Reset"/>
</s:form>
<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
<s:a  action="libros">Libros</s:a>
</body>
</html>