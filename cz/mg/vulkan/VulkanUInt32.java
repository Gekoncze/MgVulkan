package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint32_t.html">khronos documentation</a>
 **/
public class VulkanUInt32 extends VulkanObject {
    public VulkanUInt32(){
        super(new VkUInt32());
    }

    public VulkanUInt32(VkUInt32 vk){
        super(vk);
    }

    @Override
    public VkUInt32 getVk(){
        return (VkUInt32) super.getVk();
    }

    public VulkanUInt32(int value){
        super(new VkUInt32(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanUInt32 implements cz.mg.collections.array.ReadonlyArray<VulkanUInt32> {
        public Array(VkUInt32.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkUInt32.Array(count));
        }

        public Array(int count, VulkanUInt32 o){
            this(new VkUInt32.Array(count, o.getVk()));
        }

        @Override
        public VkUInt32.Array getVk(){
            return (VkUInt32.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanUInt32 get(int i){
            return new VulkanUInt32(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkUInt32.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkUInt32.Pointer());
        }

        public Pointer(long value) {
            this(new VkUInt32.Pointer(value));
        }

        @Override
        public VkUInt32.Pointer getVk(){
            return (VkUInt32.Pointer) super.getVk();
        }

        public static class Array extends VulkanUInt32.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanUInt32.Pointer> {
            public Array(int count) {
                super(new VkUInt32.Pointer.Array(count));
            }

            public Array(VulkanUInt32[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkUInt32.Pointer.Array getVk(){
                return (VkUInt32.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanUInt32.Pointer get(int i){
                return new VulkanUInt32.Pointer(getVk().get(i));
            }
        }
    }
}
