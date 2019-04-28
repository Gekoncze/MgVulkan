package cz.mg.vulkan;

public class PFNvkGetDeviceProcAddr extends VkFunctionPointer {
    public PFNvkGetDeviceProcAddr() {
    }

    protected PFNvkGetDeviceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceProcAddr"));
    }

    public long call(VkDevice device, VkChar pName){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pName != null ? pName.getVkAddress() : VkPointer.NULL);
    }

    protected static native long callNative(long vkaddress, long device, long pName);

}
