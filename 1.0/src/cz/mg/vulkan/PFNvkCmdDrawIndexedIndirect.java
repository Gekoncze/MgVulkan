package cz.mg.vulkan;

public class PFNvkCmdDrawIndexedIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndexedIndirect() {
    }

    protected PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexedIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexedIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexedIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), drawCount != null ? drawCount.getVkAddress() : VkPointer.getNullAddressNative(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);
}
