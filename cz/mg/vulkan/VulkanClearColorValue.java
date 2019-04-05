package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanClearColorValue extends VulkanObject {
    public VulkanClearColorValue(){
        super(new VkClearColorValue());
    }

    public VulkanClearColorValue(VkClearColorValue vk){
        super(vk);
    }

    @Override
    public VkClearColorValue getVk(){
        return (VkClearColorValue) super.getVk();
    }

    public VulkanClearColorValue(VulkanFloat float32) {
        super(new VkClearColorValue(float32.getVk()));
    }

    public VulkanClearColorValue(VulkanInt32 int32) {
        super(new VkClearColorValue(int32.getVk()));
    }

    public VulkanClearColorValue(VulkanUInt32 uint32) {
        super(new VkClearColorValue(uint32.getVk()));
    }


    public VulkanFloat getFloat32() {
        return new VulkanFloat(getVk().getFloat32());
    }

    public void setFloat32(VulkanFloat float32) {
        getVk().setFloat32(float32.getVk());
    }

    public VulkanInt32 getInt32() {
        return new VulkanInt32(getVk().getInt32());
    }

    public void setInt32(VulkanInt32 int32) {
        getVk().setInt32(int32.getVk());
    }

    public VulkanUInt32 getUint32() {
        return new VulkanUInt32(getVk().getUint32());
    }

    public void setUint32(VulkanUInt32 uint32) {
        getVk().setUint32(uint32.getVk());
    }


    public static class Array extends VulkanClearColorValue implements cz.mg.collections.array.ReadonlyArray<VulkanClearColorValue> {
        public Array(VkClearColorValue.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkClearColorValue.Array(count));
        }

        public Array(int count, VulkanClearColorValue o){
            this(new VkClearColorValue.Array(count, o.getVk()));
        }

        @Override
        public VkClearColorValue.Array getVk(){
            return (VkClearColorValue.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanClearColorValue get(int i){
            return new VulkanClearColorValue(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkClearColorValue.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkClearColorValue.Pointer());
        }

        public Pointer(long value) {
            this(new VkClearColorValue.Pointer(value));
        }

        @Override
        public VkClearColorValue.Pointer getVk(){
            return (VkClearColorValue.Pointer) super.getVk();
        }

        public static class Array extends VulkanClearColorValue.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanClearColorValue.Pointer> {
            public Array(int count) {
                super(new VkClearColorValue.Pointer.Array(count));
            }

            public Array(VulkanClearColorValue[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkClearColorValue.Pointer.Array getVk(){
                return (VkClearColorValue.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanClearColorValue.Pointer get(int i){
                return new VulkanClearColorValue.Pointer(getVk().get(i));
            }
        }
    }
}
