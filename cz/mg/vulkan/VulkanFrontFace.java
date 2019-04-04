package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFrontFace.html">khronos documentation</a>
 **/
public class VulkanFrontFace extends VulkanEnum {
    public static final int COUNTER_CLOCKWISE = VkFrontFace.VK_FRONT_FACE_COUNTER_CLOCKWISE;
    public static final int CLOCKWISE = VkFrontFace.VK_FRONT_FACE_CLOCKWISE;

    public VulkanFrontFace(){
        super(new VkFrontFace());
    }

    public VulkanFrontFace(VkFrontFace vk){
        super(vk);
    }

    @Override
    public VkFrontFace getVk(){
        return (VkFrontFace) super.getVk();
    }

    public VulkanFrontFace(int value){
        super(new VkFrontFace(value));
    }

    @Override
    public String toString() {
        if(getValue() == COUNTER_CLOCKWISE) return "COUNTER_CLOCKWISE";
        if(getValue() == CLOCKWISE) return "CLOCKWISE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanFrontFace implements cz.mg.collections.array.ReadonlyArray<VulkanFrontFace> {
        public Array(VkFrontFace.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFrontFace.Array(count));
        }

        public Array(int count, VulkanFrontFace o){
            this(new VkFrontFace.Array(count, o.getVk()));
        }

        @Override
        public VkFrontFace.Array getVk(){
            return (VkFrontFace.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFrontFace get(int i){
            return new VulkanFrontFace(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFrontFace.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFrontFace.Pointer());
        }

        public Pointer(long value) {
            this(new VkFrontFace.Pointer(value));
        }

        @Override
        public VkFrontFace.Pointer getVk(){
            return (VkFrontFace.Pointer) super.getVk();
        }

        public static class Array extends VulkanFrontFace.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFrontFace.Pointer> {
            public Array(int count) {
                super(new VkFrontFace.Pointer.Array(count));
            }

            public Array(VulkanFrontFace[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFrontFace.Pointer.Array getVk(){
                return (VkFrontFace.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFrontFace.Pointer get(int i){
                return new VulkanFrontFace.Pointer(getVk().get(i));
            }
        }
    }
}
