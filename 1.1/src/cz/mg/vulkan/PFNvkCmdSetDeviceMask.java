package cz.mg.vulkan;

public class PFNvkCmdSetDeviceMask extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMask() {
    }

    protected PFNvkCmdSetDeviceMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetDeviceMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDeviceMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long deviceMask);


    public void call(VkCommandBuffer commandBuffer, int deviceMask){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), deviceMask);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int deviceMask);

}
