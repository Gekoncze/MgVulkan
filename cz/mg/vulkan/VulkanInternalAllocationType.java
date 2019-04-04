package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInternalAllocationType.html">khronos documentation</a>
 **/
public class VulkanInternalAllocationType extends VulkanEnum {
    public static final int EXECUTABLE = VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;

    public VulkanInternalAllocationType(){
        super(new VkInternalAllocationType());
    }

    public VulkanInternalAllocationType(VkInternalAllocationType vk){
        super(vk);
    }

    @Override
    public VkInternalAllocationType getVk(){
        return (VkInternalAllocationType) super.getVk();
    }

    public VulkanInternalAllocationType(int value){
        super(new VkInternalAllocationType(value));
    }

    @Override
    public String toString() {
        if(getValue() == EXECUTABLE) return "EXECUTABLE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanInternalAllocationType implements cz.mg.collections.array.ReadonlyArray<VulkanInternalAllocationType> {
        public Array(VkInternalAllocationType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInternalAllocationType.Array(count));
        }

        public Array(int count, VulkanInternalAllocationType o){
            this(new VkInternalAllocationType.Array(count, o.getVk()));
        }

        @Override
        public VkInternalAllocationType.Array getVk(){
            return (VkInternalAllocationType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInternalAllocationType get(int i){
            return new VulkanInternalAllocationType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInternalAllocationType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInternalAllocationType.Pointer());
        }

        public Pointer(long value) {
            this(new VkInternalAllocationType.Pointer(value));
        }

        @Override
        public VkInternalAllocationType.Pointer getVk(){
            return (VkInternalAllocationType.Pointer) super.getVk();
        }

        public static class Array extends VulkanInternalAllocationType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInternalAllocationType.Pointer> {
            public Array(int count) {
                super(new VkInternalAllocationType.Pointer.Array(count));
            }

            public Array(VulkanInternalAllocationType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInternalAllocationType.Pointer.Array getVk(){
                return (VkInternalAllocationType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInternalAllocationType.Pointer get(int i){
                return new VulkanInternalAllocationType.Pointer(getVk().get(i));
            }
        }
    }
}
