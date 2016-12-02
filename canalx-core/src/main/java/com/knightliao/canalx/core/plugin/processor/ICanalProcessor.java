package com.knightliao.canalx.core.plugin.processor;

import com.knightliao.canalx.core.dto.MysqlEntryWrap;
import com.knightliao.canalx.core.exception.CanalxProcessorException;
import com.knightliao.canalx.core.exception.CanalxProcessorInitException;

/**
 * 消息处理接口
 *
 * @author knightliao
 * @date 2016/11/23 17:08
 */
public interface ICanalProcessor {

    /**
     * update
     *
     * @param entry
     * @param
     */
    void processUpdate(MysqlEntryWrap entry) throws CanalxProcessorException;

    /**
     * insert
     *
     * @param entry
     * @param
     */
    void processInsert(MysqlEntryWrap entry) throws CanalxProcessorException;

    /**
     * delete
     *
     * @param entry
     * @param
     */
    void processDelete(MysqlEntryWrap entry) throws CanalxProcessorException;

    /**
     * @throws CanalxProcessorInitException
     */
    void init() throws CanalxProcessorInitException;
}