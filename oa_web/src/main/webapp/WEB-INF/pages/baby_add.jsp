<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 添加baby</h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/baby/add" modelAttribute="baby"  id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 基本信息 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="b_id" class="field prepend-icon">
                                    <form:input path="b_id" cssClass="gui-input" placeholder="编号..."/>
                                    <label for="b_id" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="b_name" class="field prepend-icon">
                                    <form:input path="b_name" cssClass="gui-input" placeholder="名字..." />
                                    <label for="b_name" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="b_age" class="field prepend-icon">
                                    <form:input path="b_age" cssClass="gui-input" placeholder="年龄..."/>
                                    <label for="b_age" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="room" class="field prepend-icon">
                                    <form:input path="room" cssClass="gui-input" placeholder="房间..." />
                                    <label for="room" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="bed" class="field prepend-icon">
                                    <form:input path="bed" cssClass="gui-input" placeholder="床..."/>
                                    <label for="bed" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="b_companyid" class="field prepend-icon">
                                    <form:input path="b_companyid" cssClass="gui-input" placeholder="公司..." />
                                    <label for="b_companyid" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section">
                            <label for="info" class="field prepend-icon">
                                <form:input path="info" cssClass="gui-input" placeholder="信息..." />
                                <label for="info" class="field-icon">
                                    <i class="fa fa-lock"></i>
                                </label>
                            </label>
                        </div>

                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 保存 </button>
                            <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回 </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="bottom.jsp"/>