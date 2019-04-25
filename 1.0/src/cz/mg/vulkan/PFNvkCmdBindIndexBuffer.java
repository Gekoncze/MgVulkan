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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress(), indexType != null ? indexType.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long indexType);
}
