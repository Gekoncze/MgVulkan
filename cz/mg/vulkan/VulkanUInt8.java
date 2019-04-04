package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint8_t.html">khronos documentation</a>
 **/
public class VulkanUInt8 extends VulkanObject {
    public VulkanUInt8(){
        super(new VkUInt8());
    }

    public VulkanUInt8(VkUInt8 vk){
        super(vk);
    }

    @Override
    public VkUInt8 getVk(){
        return (VkUInt8) super.getVk();
    }

    public VulkanUInt8(byte value){
        super(new VkUInt8(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanUInt8 implements cz.mg.collections.array.ReadonlyArray<VulkanUInt8> {
        public Array(VkUInt8.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkUInt8.Array(count));
        }

        public Array(int count, VulkanUInt8 o){
            this(new VkUInt8.Array(count, o.getVk()));
        }

        @Override
        public VkUInt8.Array getVk(){
            return (VkUInt8.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanUInt8 get(int i){
            return new VulkanUInt8(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkUInt8.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkUInt8.Pointer());
        }

        public Pointer(long value) {
            this(new VkUInt8.Pointer(value));
        }

        @Override
        public VkUInt8.Pointer getVk(){
            return (VkUInt8.Pointer) super.getVk();
        }

        public static class Array extends VulkanUInt8.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanUInt8.Pointer> {
            public Array(int count) {
                super(new VkUInt8.Pointer.Array(count));
            }

            public Array(VulkanUInt8[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkUInt8.Pointer.Array getVk(){
                return (VkUInt8.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanUInt8.Pointer get(int i){
                return new VulkanUInt8.Pointer(getVk().get(i));
            }
        }
    }
}
