package cz.mg.vulkan;

public class PFNvkCmdBeginDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdBeginDebugUtilsLabelEXT() {
    }

    protected PFNvkCmdBeginDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBeginDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBeginDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pLabelInfo);



}
