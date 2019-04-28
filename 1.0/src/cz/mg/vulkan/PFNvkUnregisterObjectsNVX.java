package cz.mg.vulkan;

public class PFNvkUnregisterObjectsNVX extends VkFunctionPointer {
    public PFNvkUnregisterObjectsNVX() {
    }

    protected PFNvkUnregisterObjectsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkUnregisterObjectsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkUnregisterObjectsNVX(long value) {
        setValue(value);
    }

    public PFNvkUnregisterObjectsNVX(VkInstance instance) {
        super(instance, new VkString("vkUnregisterObjectsNVX"));
    }

    public int call(VkDevice device, VkObjectTableNVX objectTable, int objectCount, VkObjectEntryTypeNVX pObjectEntryTypes, VkUInt32 pObjectIndices){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative(), objectCount, pObjectEntryTypes != null ? pObjectEntryTypes.getVkAddress() : VkPointer.NULL, pObjectIndices != null ? pObjectIndices.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long objectTable, int objectCount, long pObjectEntryTypes, long pObjectIndices);

}
