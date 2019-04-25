package cz.mg.vulkan;

public class PFNvkCmdEndDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdEndDebugUtilsLabelEXT() {
    }

    protected PFNvkCmdEndDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdEndDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdEndDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdEndDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdEndDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer);
}
