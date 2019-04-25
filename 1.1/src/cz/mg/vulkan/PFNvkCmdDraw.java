package cz.mg.vulkan;

public class PFNvkCmdDraw extends VkFunctionPointer {
    public PFNvkCmdDraw() {
    }

    protected PFNvkCmdDraw(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDraw(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDraw(long value) {
        setValue(value);
    }

    public PFNvkCmdDraw(VkInstance instance) {
        super(instance, new VkString("vkCmdDraw"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 vertexCount, VkUInt32 instanceCount, VkUInt32 firstVertex, VkUInt32 firstInstance){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), vertexCount != null ? vertexCount.getVkAddress() : VkPointer.getNullAddressNative(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getNullAddressNative(), firstVertex != null ? firstVertex.getVkAddress() : VkPointer.getNullAddressNative(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long vertexCount, long instanceCount, long firstVertex, long firstInstance);
}
