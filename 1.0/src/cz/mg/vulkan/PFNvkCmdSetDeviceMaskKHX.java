package cz.mg.vulkan;

public class PFNvkCmdSetDeviceMaskKHX extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMaskKHX() {
    }

    public PFNvkCmdSetDeviceMaskKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDeviceMaskKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDeviceMaskKHX(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMaskKHX(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMaskKHX"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
