package cz.mg.vulkan;

public class PFNvkDisplayPowerControlEXT extends VkFunctionPointer {
    public PFNvkDisplayPowerControlEXT() {
    }

    public PFNvkDisplayPowerControlEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDisplayPowerControlEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDisplayPowerControlEXT(long value) {
        setValue(value);
    }

    public PFNvkDisplayPowerControlEXT(VkInstance instance) {
        super(instance, new VkString("vkDisplayPowerControlEXT"));
    }

    public void call(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), display != null ? display.getVkAddress() : VkPointer.getNullAddress(), pDisplayPowerInfo != null ? pDisplayPowerInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long display, long pDisplayPowerInfo, long rval);
}
