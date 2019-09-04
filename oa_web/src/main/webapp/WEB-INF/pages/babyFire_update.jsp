<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 编辑babyFire</h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form action="/babyFire/update" modelAttribute="babyFire"  id="admin-form" name="addForm">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 基本信息 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="bf_id" class="field prepend-icon">
                                    <form:input path="bf_id" cssClass="gui-input" placeholder="编号..."/>
                                    <label for="bf_id" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="bf_time" class="field prepend-icon">
                                    <form:input path="bf_time" cssClass="gui-input" placeholder="时间..." />
                                    <label for="bf_time" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="bf_data" class="field prepend-icon">
                                    <form:input path="bf_data" cssClass="gui-input" placeholder="数据..."/>
                                    <label for="bf_data" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="bf_room" class="field prepend-icon">
                                    <form:input path="bf_room" cssClass="gui-input" placeholder="房间..." />
                                    <label for="bf_room" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="bf_bed" class="field prepend-icon">
                                    <form:input path="bf_bed" cssClass="gui-input" placeholder="床..."/>
                                    <label for="bf_bed" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="bf_companyid" class="field prepend-icon">
                                    <form:input path="bf_companyid" cssClass="gui-input" placeholder="公司..." />
                                    <label for="bf_companyid" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
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