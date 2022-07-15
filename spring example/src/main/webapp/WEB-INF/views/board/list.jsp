<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="../includes/header.jsp" %>
        <div id="page-wrapper">
        <script
  src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous">
        </script>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
							board list page
							<button id="regBtn" type="button" class="btn btn-xs pull-right">이걸 누르면 뿅간다</button>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>#번호</th>
                                        <th>제목</th>
                                        <th>작성일</th>
                                        <th>작성자</th>
                                        <th>변경일</th>
                                    </tr>
                                </thead>
                                
	                                <c:forEach items="${list }" var="board">
	                                    <tr class="odd gradeX">
	                                        <td>${board.bno }</td>
	                                        <td>${board.title }</td>
	                                        <td>${board.content }</td>
	                                        <td class="center">${board.writer }</td>
	                                        <td class="center"><fmt:formatDate value="${board.regdate }" pattern="yyyy-MM-dd"/> </td>
	                                     
	                                    </tr>
	                                   </c:forEach>
                                
                            </table>
                            <!-- /.table-responsive -->
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
          
  <%@ include file="../includes/footer.jsp" %>