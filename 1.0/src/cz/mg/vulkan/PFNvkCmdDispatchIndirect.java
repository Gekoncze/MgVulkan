package cz.mg.vulkan;

public class PFNvkCmdDispatchIndirect extends VkFunctionPointer {
    public PFNvkCmdDispatchIndirect() {
    }

    protected PFNvkCmdDispatchIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDispatchIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long buffer, long offset);


    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, long offset){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long buffer, long offset);

}
