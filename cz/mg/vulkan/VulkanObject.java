package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObject {
    private final VkObject vk;

    public VulkanObject(VkObject vk){
        this.vk = vk;
    }

    public VkObject getVk(){
        return vk;
    }

    @Override
    public String toString(){
        return vk.toString();
    }

    public static class Pointer extends VulkanPointer {
        public Pointer(VkObject.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObject.Pointer());
        }

        public Pointer(long value) {
            this(new VkObject.Pointer(value));
        }

        @Override
        public VkObject.Pointer getVk(){
            return (VkObject.Pointer) super.getVk();
        }

        public static class Array extends VulkanObject.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObject.Pointer> {
            public Array(int count) {
                super(new VkObject.Pointer.Array(count));
            }

            public Array(VulkanObject[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObject.Pointer.Array getVk(){
                return (VkObject.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObject.Pointer get(int i){
                return new VulkanObject.Pointer(getVk().get(i));
            }
        }
    }
}
