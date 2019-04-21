package cz.mg.vulkan;

public class PFNvkCmdResetEvent extends VkFunctionPointer {
    public PFNvkCmdResetEvent() {
    }

    public PFNvkCmdResetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdResetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdResetEvent(long value) {
        setValue(value);
    }

    public PFNvkCmdResetEvent(VkInstance instance) {
        super(instance, new VkString("vkCmdResetEvent"));
    }

    public void call(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), event != null ? event.getVkAddress() : VkPointer.getNullAddress(), stageMask != null ? stageMask.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long event, long stageMask);
}
