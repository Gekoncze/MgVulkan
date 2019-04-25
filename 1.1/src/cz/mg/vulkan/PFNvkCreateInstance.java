package cz.mg.vulkan;

public class PFNvkCreateInstance extends VkFunctionPointer {
    public PFNvkCreateInstance() {
    }

    public PFNvkCreateInstance(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateInstance(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateInstance(long value) {
        setValue(value);
    }

    public PFNvkCreateInstance(VkInstance instance) {
        super(instance, new VkString("vkCreateInstance"));
    }

    public void call(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkInstance pInstance, VkResult rval){
        call(getValue(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pInstance != null ? pInstance.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long pCreateInfo, long pAllocator, long pInstance, long rval);
}
