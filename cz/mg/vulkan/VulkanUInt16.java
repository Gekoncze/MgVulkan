package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanUInt16 extends VulkanObject {
    public VulkanUInt16(){
        super(new VkUInt16());
    }

    public VulkanUInt16(VkUInt16 vk){
        super(vk);
    }

    @Override
    public VkUInt16 getVk(){
        return (VkUInt16) super.getVk();
    }

    public VulkanUInt16(short value){
        super(new VkUInt16(value));
    }

    public short getValue(){
        return getVk().getValue();
    }

    public void setValue(short value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanUInt16 implements cz.mg.collections.array.ReadonlyArray<VulkanUInt16> {
        public Array(VkUInt16.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkUInt16.Array(count));
        }

        public Array(int count, VulkanUInt16 o){
            this(new VkUInt16.Array(count, o.getVk()));
        }

        @Override
        public VkUInt16.Array getVk(){
            return (VkUInt16.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanUInt16 get(int i){
            return new VulkanUInt16(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkUInt16.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkUInt16.Pointer());
        }

        public Pointer(long value) {
            this(new VkUInt16.Pointer(value));
        }

        @Override
        public VkUInt16.Pointer getVk(){
            return (VkUInt16.Pointer) super.getVk();
        }

        public static class Array extends VulkanUInt16.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanUInt16.Pointer> {
            public Array(int count) {
                super(new VkUInt16.Pointer.Array(count));
            }

            public Array(VulkanUInt16[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkUInt16.Pointer.Array getVk(){
                return (VkUInt16.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanUInt16.Pointer get(int i){
                return new VulkanUInt16.Pointer(getVk().get(i));
            }
        }
    }
}
