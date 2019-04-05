package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSize extends VulkanObject {
    public VulkanSize(){
        super(new VkSize());
    }

    public VulkanSize(VkSize vk){
        super(vk);
    }

    @Override
    public VkSize getVk(){
        return (VkSize) super.getVk();
    }

    public VulkanSize(long value){
        super(new VkSize(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanSize implements cz.mg.collections.array.ReadonlyArray<VulkanSize> {
        public Array(VkSize.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSize.Array(count));
        }

        public Array(int count, VulkanSize o){
            this(new VkSize.Array(count, o.getVk()));
        }

        @Override
        public VkSize.Array getVk(){
            return (VkSize.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSize get(int i){
            return new VulkanSize(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSize.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSize.Pointer());
        }

        public Pointer(long value) {
            this(new VkSize.Pointer(value));
        }

        @Override
        public VkSize.Pointer getVk(){
            return (VkSize.Pointer) super.getVk();
        }

        public static class Array extends VulkanSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSize.Pointer> {
            public Array(int count) {
                super(new VkSize.Pointer.Array(count));
            }

            public Array(VulkanSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSize.Pointer.Array getVk(){
                return (VkSize.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSize.Pointer get(int i){
                return new VulkanSize.Pointer(getVk().get(i));
            }
        }
    }
}
