package cz.mg.vulkan;

public class PFNvkCmdInsertDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdInsertDebugUtilsLabelEXT() {
    }

    protected PFNvkCmdInsertDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdInsertDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdInsertDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdInsertDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdInsertDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pLabelInfo);



}
