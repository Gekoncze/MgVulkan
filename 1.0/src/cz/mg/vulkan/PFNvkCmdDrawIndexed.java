package cz.mg.vulkan;

public class PFNvkCmdDrawIndexed extends VkFunctionPointer {
    public PFNvkCmdDrawIndexed() {
    }

    public PFNvkCmdDrawIndexed(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndexed(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexed(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexed(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexed"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 indexCount, VkUInt32 instanceCount, VkUInt32 firstIndex, VkInt32 vertexOffset, VkUInt32 firstInstance){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getNullAddressNative(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getNullAddressNative(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getNullAddressNative(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getNullAddressNative(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long indexCount, long instanceCount, long firstIndex, long vertexOffset, long firstInstance);
}
