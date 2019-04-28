package cz.mg.vulkan;

public class PFNvkCmdDrawIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndirect() {
    }

    protected PFNvkCmdDrawIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDrawIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), drawCount != null ? drawCount.getVkAddress() : VkPointer.getNullAddressNative(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);


    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset, int drawCount, int stride){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset, drawCount, stride);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long buffer, long offset, int drawCount, int stride);

}
