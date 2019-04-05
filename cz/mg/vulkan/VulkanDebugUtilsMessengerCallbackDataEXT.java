package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessengerCallbackDataEXT extends VulkanObject {
    public VulkanDebugUtilsMessengerCallbackDataEXT(){
        super(new VkDebugUtilsMessengerCallbackDataEXT());
    }

    public VulkanDebugUtilsMessengerCallbackDataEXT(VkDebugUtilsMessengerCallbackDataEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCallbackDataEXT getVk(){
        return (VkDebugUtilsMessengerCallbackDataEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerCallbackDataEXT(VulkanStructureType sType, VulkanObject pNext, VulkanDebugUtilsMessengerCallbackDataFlagsEXT flags, VulkanChar pMessageIdName, VulkanInt32 messageIdNumber, VulkanChar pMessage, VulkanUInt32 queueLabelCount, VulkanDebugUtilsLabelEXT pQueueLabels, VulkanUInt32 cmdBufLabelCount, VulkanDebugUtilsLabelEXT pCmdBufLabels, VulkanUInt32 objectCount, VulkanDebugUtilsObjectNameInfoEXT pObjects) {
        super(new VkDebugUtilsMessengerCallbackDataEXT(sType.getVk(), pNext.getVk(), flags.getVk(), pMessageIdName.getVk(), messageIdNumber.getVk(), pMessage.getVk(), queueLabelCount.getVk(), pQueueLabels.getVk(), cmdBufLabelCount.getVk(), pCmdBufLabels.getVk(), objectCount.getVk(), pObjects.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT getFlags() {
        return new VulkanDebugUtilsMessengerCallbackDataFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanDebugUtilsMessengerCallbackDataFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanChar getPMessageIdName() {
        return new VulkanChar(getVk().getPMessageIdName());
    }

    public void setPMessageIdName(VulkanChar pMessageIdName) {
        getVk().setPMessageIdName(pMessageIdName.getVk());
    }

    public VulkanInt32 getMessageIdNumber() {
        return new VulkanInt32(getVk().getMessageIdNumber());
    }

    public void setMessageIdNumber(VulkanInt32 messageIdNumber) {
        getVk().setMessageIdNumber(messageIdNumber.getVk());
    }

    public VulkanChar getPMessage() {
        return new VulkanChar(getVk().getPMessage());
    }

    public void setPMessage(VulkanChar pMessage) {
        getVk().setPMessage(pMessage.getVk());
    }

    public VulkanUInt32 getQueueLabelCount() {
        return new VulkanUInt32(getVk().getQueueLabelCount());
    }

    public void setQueueLabelCount(VulkanUInt32 queueLabelCount) {
        getVk().setQueueLabelCount(queueLabelCount.getVk());
    }

    public VulkanDebugUtilsLabelEXT getPQueueLabels() {
        return new VulkanDebugUtilsLabelEXT(getVk().getPQueueLabels());
    }

    public void setPQueueLabels(VulkanDebugUtilsLabelEXT pQueueLabels) {
        getVk().setPQueueLabels(pQueueLabels.getVk());
    }

    public VulkanUInt32 getCmdBufLabelCount() {
        return new VulkanUInt32(getVk().getCmdBufLabelCount());
    }

    public void setCmdBufLabelCount(VulkanUInt32 cmdBufLabelCount) {
        getVk().setCmdBufLabelCount(cmdBufLabelCount.getVk());
    }

    public VulkanDebugUtilsLabelEXT getPCmdBufLabels() {
        return new VulkanDebugUtilsLabelEXT(getVk().getPCmdBufLabels());
    }

    public void setPCmdBufLabels(VulkanDebugUtilsLabelEXT pCmdBufLabels) {
        getVk().setPCmdBufLabels(pCmdBufLabels.getVk());
    }

    public VulkanUInt32 getObjectCount() {
        return new VulkanUInt32(getVk().getObjectCount());
    }

    public void setObjectCount(VulkanUInt32 objectCount) {
        getVk().setObjectCount(objectCount.getVk());
    }

    public VulkanDebugUtilsObjectNameInfoEXT getPObjects() {
        return new VulkanDebugUtilsObjectNameInfoEXT(getVk().getPObjects());
    }

    public void setPObjects(VulkanDebugUtilsObjectNameInfoEXT pObjects) {
        getVk().setPObjects(pObjects.getVk());
    }


    public static class Array extends VulkanDebugUtilsMessengerCallbackDataEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCallbackDataEXT> {
        public Array(VkDebugUtilsMessengerCallbackDataEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessengerCallbackDataEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessengerCallbackDataEXT o){
            this(new VkDebugUtilsMessengerCallbackDataEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataEXT.Array getVk(){
            return (VkDebugUtilsMessengerCallbackDataEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerCallbackDataEXT get(int i){
            return new VulkanDebugUtilsMessengerCallbackDataEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessengerCallbackDataEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessengerCallbackDataEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessengerCallbackDataEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataEXT.Pointer getVk(){
            return (VkDebugUtilsMessengerCallbackDataEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessengerCallbackDataEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCallbackDataEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessengerCallbackDataEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessengerCallbackDataEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessengerCallbackDataEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessengerCallbackDataEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessengerCallbackDataEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessengerCallbackDataEXT.Pointer(getVk().get(i));
            }
        }
    }
}
