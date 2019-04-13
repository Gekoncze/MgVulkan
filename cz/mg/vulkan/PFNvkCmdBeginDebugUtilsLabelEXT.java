package cz.mg.vulkan;

public class PFNvkCmdBeginDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdBeginDebugUtilsLabelEXT() {
    }

    public PFNvkCmdBeginDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBeginDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBeginDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pLabelInfo);
}
