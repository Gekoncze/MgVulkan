package cz.mg.vulkan;

public class PFNvkCmdSetDeviceMaskKHR extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMaskKHR() {
    }

    protected PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDeviceMaskKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMaskKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMaskKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
