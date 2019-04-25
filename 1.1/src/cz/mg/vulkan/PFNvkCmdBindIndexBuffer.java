package cz.mg.vulkan;

public class PFNvkCmdBindIndexBuffer extends VkFunctionPointer {
    public PFNvkCmdBindIndexBuffer() {
    }

    public PFNvkCmdBindIndexBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBindIndexBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBindIndexBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdBindIndexBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdBindIndexBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkIndexType indexType){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), indexType != null ? indexType.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long indexType);
}
