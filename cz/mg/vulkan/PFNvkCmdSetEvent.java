package cz.mg.vulkan;

public class PFNvkCmdSetEvent extends VkFunctionPointer {
    public PFNvkCmdSetEvent() {
    }

    public PFNvkCmdSetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetEvent(long value) {
        setValue(value);
    }

    public PFNvkCmdSetEvent(VkInstance instance) {
        super(instance, new VkString("vkCmdSetEvent"));
    }

    public void call(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), event != null ? event.getVkAddress() : VkPointer.getNullAddress(), stageMask != null ? stageMask.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long event, long stageMask);
}
