package cz.mg.vulkan;

public class PFNvkCmdSetViewportWScalingNV extends VkFunctionPointer {
    public PFNvkCmdSetViewportWScalingNV() {
    }

    protected PFNvkCmdSetViewportWScalingNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetViewportWScalingNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetViewportWScalingNV(long value) {
        setValue(value);
    }

    public PFNvkCmdSetViewportWScalingNV(VkInstance instance) {
        super(instance, new VkString("vkCmdSetViewportWScalingNV"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewportWScalingNV pViewportWScalings){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), firstViewport != null ? firstViewport.getVkAddress() : VkPointer.getNullAddressNative(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddressNative(), pViewportWScalings != null ? pViewportWScalings.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewportWScalings);
}
