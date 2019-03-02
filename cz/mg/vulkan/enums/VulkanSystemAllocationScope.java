package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkSystemAllocationScope;


public enum VulkanSystemAllocationScope {
    COMMAND,
    OBJECT,
    CACHE,
    DEVICE,
    INSTANCE;

    public static VulkanSystemAllocationScope fromNativeEnum(VkSystemAllocationScope e){
        switch(e.value){
            case VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND: return COMMAND;
            case VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT: return OBJECT;
            case VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE: return CACHE;
            case VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE: return DEVICE;
            case VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE: return INSTANCE;
            default: return null;
        }
    }

    public VkSystemAllocationScope toNativeEnum(){
        switch(this){
            case COMMAND: return new VkSystemAllocationScope(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND);
            case OBJECT: return new VkSystemAllocationScope(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT);
            case CACHE: return new VkSystemAllocationScope(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE);
            case DEVICE: return new VkSystemAllocationScope(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE);
            case INSTANCE: return new VkSystemAllocationScope(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE);
            default: throw new RuntimeException();
        }
    }
}
