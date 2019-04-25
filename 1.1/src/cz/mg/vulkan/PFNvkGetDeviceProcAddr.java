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

    public void call(VkDevice device, VkChar pName, PFNvkVoidFunction rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pName, long rval);
}
