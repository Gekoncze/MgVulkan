package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSystemAllocationScope.html">khronos documentation</a>
 **/
public class VulkanSystemAllocationScope extends VulkanEnum {
    public static final int COMMAND = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND;
    public static final int OBJECT = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT;
    public static final int CACHE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE;
    public static final int DEVICE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE;
    public static final int INSTANCE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE;

    public VulkanSystemAllocationScope(){
        super(new VkSystemAllocationScope());
    }

    public VulkanSystemAllocationScope(VkSystemAllocationScope vk){
        super(vk);
    }

    @Override
    public VkSystemAllocationScope getVk(){
        return (VkSystemAllocationScope) super.getVk();
    }

    public VulkanSystemAllocationScope(int value){
        super(new VkSystemAllocationScope(value));
    }

    @Override
    public String toString() {
        if(getValue() == COMMAND) return "COMMAND";
        if(getValue() == OBJECT) return "OBJECT";
        if(getValue() == CACHE) return "CACHE";
        if(getValue() == DEVICE) return "DEVICE";
        if(getValue() == INSTANCE) return "INSTANCE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSystemAllocationScope implements cz.mg.collections.array.ReadonlyArray<VulkanSystemAllocationScope> {
        public Array(VkSystemAllocationScope.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSystemAllocationScope.Array(count));
        }

        public Array(int count, VulkanSystemAllocationScope o){
            this(new VkSystemAllocationScope.Array(count, o.getVk()));
        }

        @Override
        public VkSystemAllocationScope.Array getVk(){
            return (VkSystemAllocationScope.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSystemAllocationScope get(int i){
            return new VulkanSystemAllocationScope(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSystemAllocationScope.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSystemAllocationScope.Pointer());
        }

        public Pointer(long value) {
            this(new VkSystemAllocationScope.Pointer(value));
        }

        @Override
        public VkSystemAllocationScope.Pointer getVk(){
            return (VkSystemAllocationScope.Pointer) super.getVk();
        }

        public static class Array extends VulkanSystemAllocationScope.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSystemAllocationScope.Pointer> {
            public Array(int count) {
                super(new VkSystemAllocationScope.Pointer.Array(count));
            }

            public Array(VulkanSystemAllocationScope[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSystemAllocationScope.Pointer.Array getVk(){
                return (VkSystemAllocationScope.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSystemAllocationScope.Pointer get(int i){
                return new VulkanSystemAllocationScope.Pointer(getVk().get(i));
            }
        }
    }
}
