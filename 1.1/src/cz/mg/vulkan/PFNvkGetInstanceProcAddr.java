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

    public long call(VkInstance instance, VkChar pName){
        return callNative(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getNullAddressNative(), pName != null ? pName.getVkAddress() : VkPointer.NULL);
    }

    protected static native long callNative(long vkaddress, long instance, long pName);

}
