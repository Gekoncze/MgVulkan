package cz.mg.vulkan;

public class PFNvkBindBufferMemory2 extends VkFunctionPointer {
    public PFNvkBindBufferMemory2() {
    }

    protected PFNvkBindBufferMemory2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkBindBufferMemory2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkBindBufferMemory2(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory2(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory2"));
    }

    public int call(VkDevice device, int bindInfoCount, VkBindBufferMemoryInfo pBindInfos){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), bindInfoCount, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, int bindInfoCount, long pBindInfos);

}
