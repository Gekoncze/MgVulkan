package cz.mg.vulkan;

public class PFNvkCmdDrawIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndirect() {
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), drawCount != null ? drawCount.getVkAddress() : VkPointer.getNullAddressNative(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);
}
