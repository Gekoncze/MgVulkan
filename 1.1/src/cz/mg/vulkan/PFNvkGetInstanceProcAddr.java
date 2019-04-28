package cz.mg.vulkan;

public class PFNvkGetInstanceProcAddr extends VkFunctionPointer {
    public PFNvkGetInstanceProcAddr() {
    }

    protected PFNvkGetInstanceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetInstanceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetInstanceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetInstanceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetInstanceProcAddr"));
    }

    public void call(VkInstance instance, VkChar pName, PFNvkVoidFunction rval){
        callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long instance, long pName, long rval);



}
