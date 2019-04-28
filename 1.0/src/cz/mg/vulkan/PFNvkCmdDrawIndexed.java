package cz.mg.vulkan;

public class PFNvkCmdDrawIndexed extends VkFunctionPointer {
    public PFNvkCmdDrawIndexed() {
    }

    protected PFNvkCmdDrawIndexed(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndexed(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexed(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexed(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexed"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 indexCount, VkUInt32 instanceCount, VkUInt32 firstIndex, VkInt32 vertexOffset, VkUInt32 firstInstance){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getNullAddressNative(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getNullAddressNative(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getNullAddressNative(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getNullAddressNative(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long indexCount, long instanceCount, long firstIndex, long vertexOffset, long firstInstance);


    public void call(VkCommandBuffer commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), indexCount, instanceCount, firstIndex, vertexOffset, firstInstance);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance);

}
