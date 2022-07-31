package com.costinel.workshop_create_job_microservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;

    @Column
    String jobStatus;

    @Column
    long customerId;

    @Column
    long vehicleId;

    @Column
    long insurerId;

    @Column
    long estimateId;

    @Column
    long invoiceID;

    @Column
    long repairProgressId;

    @Column
    long tasksId;

    @Column
    long bidId;

    @Column
    long replacementVehicleId;

    @Column
    long filesId;

    public Job(long id, String jobStatus, long customerId, long vehicleId, long insurerId, long estimateId, long invoiceID, long repairProgressId, long tasksId, long bidId, long replacementVehicleId, long filesId) {
        Id = id;
        this.jobStatus = jobStatus;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.insurerId = insurerId;
        this.estimateId = estimateId;
        this.invoiceID = invoiceID;
        this.repairProgressId = repairProgressId;
        this.tasksId = tasksId;
        this.bidId = bidId;
        this.replacementVehicleId = replacementVehicleId;
        this.filesId = filesId;
    }

    public Job() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public long getInsurerId() {
        return insurerId;
    }

    public void setInsurerId(long insurerId) {
        this.insurerId = insurerId;
    }

    public long getEstimateId() {
        return estimateId;
    }

    public void setEstimateId(long estimateId) {
        this.estimateId = estimateId;
    }

    public long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public long getRepairProgressId() {
        return repairProgressId;
    }

    public void setRepairProgressId(long repairProgressId) {
        this.repairProgressId = repairProgressId;
    }

    public long getTasksId() {
        return tasksId;
    }

    public void setTasksId(long tasksId) {
        this.tasksId = tasksId;
    }

    public long getBidId() {
        return bidId;
    }

    public void setBidId(long bidId) {
        this.bidId = bidId;
    }

    public long getReplacementVehicleId() {
        return replacementVehicleId;
    }

    public void setReplacementVehicleId(long replacementVehicleId) {
        this.replacementVehicleId = replacementVehicleId;
    }

    public long getFilesId() {
        return filesId;
    }

    public void setFilesId(long filesId) {
        this.filesId = filesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Id == job.Id && customerId == job.customerId && vehicleId == job.vehicleId && insurerId == job.insurerId && estimateId == job.estimateId && invoiceID == job.invoiceID && repairProgressId == job.repairProgressId && tasksId == job.tasksId && bidId == job.bidId && replacementVehicleId == job.replacementVehicleId && filesId == job.filesId && Objects.equals(jobStatus, job.jobStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, jobStatus, customerId, vehicleId, insurerId, estimateId, invoiceID, repairProgressId, tasksId, bidId, replacementVehicleId, filesId);
    }

    @Override
    public String toString() {
        return "Job{" +
                "Id=" + Id +
                ", jobStatus='" + jobStatus + '\'' +
                ", customerId=" + customerId +
                ", vehicleId=" + vehicleId +
                ", insurerId=" + insurerId +
                ", estimateId=" + estimateId +
                ", invoiceID=" + invoiceID +
                ", repairProgressId=" + repairProgressId +
                ", tasksId=" + tasksId +
                ", bidId=" + bidId +
                ", replacementVehicleId=" + replacementVehicleId +
                ", filesId=" + filesId +
                '}';
    }
}
