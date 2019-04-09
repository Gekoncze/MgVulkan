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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, firstViewport != null ? firstViewport.getVkAddress() : VkPointer.NULL_ADDRESS, viewportCount != null ? viewportCount.getVkAddress() : VkPointer.NULL_ADDRESS, pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewportWScalings);
}
