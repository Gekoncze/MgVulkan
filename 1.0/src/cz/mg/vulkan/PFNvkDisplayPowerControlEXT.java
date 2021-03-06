package cz.mg.vulkan;

public class PFNvkDisplayPowerControlEXT extends VkFunctionPointer {
    public PFNvkDisplayPowerControlEXT() {
    }

    protected PFNvkDisplayPowerControlEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkDisplayPowerControlEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkDisplayPowerControlEXT(long value) {
        setValue(value);
    }

    public PFNvkDisplayPowerControlEXT(VkInstance instance) {
        super(instance, new VkString("vkDisplayPowerControlEXT"));
    }

    public int call(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayPowerInfo != null ? pDisplayPowerInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long display, long pDisplayPowerInfo);

}
