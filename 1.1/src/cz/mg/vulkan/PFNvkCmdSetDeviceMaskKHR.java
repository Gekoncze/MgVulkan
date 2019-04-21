package cz.mg.vulkan;

public class PFNvkCmdSetDeviceMaskKHR extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMaskKHR() {
    }

    public PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDeviceMaskKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMaskKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMaskKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
