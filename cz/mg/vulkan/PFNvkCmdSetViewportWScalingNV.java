package cz.mg.vulkan;

public class PFNvkCmdSetViewportWScalingNV extends VkFunctionPointer {
    public PFNvkCmdSetViewportWScalingNV() {
    }

    public PFNvkCmdSetViewportWScalingNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetViewportWScalingNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetViewportWScalingNV(long value) {
        setValue(value);
    }

    public PFNvkCmdSetViewportWScalingNV(VkInstance instance) {
        super(instance, new VkString("vkCmdSetViewportWScalingNV"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewportWScalingNV pViewportWScalings){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), firstViewport != null ? firstViewport.getVkAddress() : VkPointer.getNullAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddress(), pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewportWScalings);
}
