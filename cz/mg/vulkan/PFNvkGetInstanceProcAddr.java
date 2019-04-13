package cz.mg.vulkan;

public class PFNvkGetInstanceProcAddr extends VkFunctionPointer {
    public PFNvkGetInstanceProcAddr() {
    }

    public PFNvkGetInstanceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetInstanceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetInstanceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetInstanceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetInstanceProcAddr"));
    }

    public void call(VkInstance instance, VkChar pName, PFNvkVoidFunction rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.getSinkAddress(), pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long instance, long pName, long rval);
}
