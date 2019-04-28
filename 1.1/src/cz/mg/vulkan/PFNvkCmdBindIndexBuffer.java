package cz.mg.vulkan;

public class PFNvkCmdBindIndexBuffer extends VkFunctionPointer {
    public PFNvkCmdBindIndexBuffer() {
    }

    protected PFNvkCmdBindIndexBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBindIndexBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBindIndexBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdBindIndexBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdBindIndexBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkIndexType indexType){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), indexType != null ? indexType.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long buffer, long offset, long indexType);


    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int indexType){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset, indexType);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long buffer, long offset, int indexType);

}
