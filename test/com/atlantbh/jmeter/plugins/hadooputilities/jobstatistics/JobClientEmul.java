/*
 * Copyright 2013 undera.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atlantbh.jmeter.plugins.hadooputilities.jobstatistics;

import java.io.IOException;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobID;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.mapred.TaskReport;

/**
 *
 * @author undera
 */
class JobClientEmul extends JobClient {

    public JobClientEmul() {
    }

    @Override
    public RunningJob getJob(JobID jobid) throws IOException {
        return new RunningJobEmul();
    }

    @Override
    public TaskReport[] getMapTaskReports(JobID jobId) throws IOException {
        return new TaskReport[0];
    }

    @Override
    public TaskReport[] getReduceTaskReports(JobID jobId) throws IOException {
        return new TaskReport[0];
    }
}
