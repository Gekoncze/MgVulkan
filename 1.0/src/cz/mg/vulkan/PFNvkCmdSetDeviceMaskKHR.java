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

    public void call(VkCommandBuffer commandBuffer, int deviceMask){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), deviceMask);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int deviceMask);

}
